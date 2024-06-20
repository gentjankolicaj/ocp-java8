package ocp.java8.hacker_rank_challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class HackerRankChallenge {

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {

    String[] xpathArray = readXpathFromConsole();

    JsonMapper jsonMapper = new JsonMapper();

    JsonNode rootJsonNode = jsonMapper.readTree(xpathArray);

    String jsonString = new JsonBuilder().setRootNode(rootJsonNode).build();

    System.out.println(jsonString);

  }


  public static String[] readXpathFromConsole() {
    int numberOfXpaths = 0;
    numberOfXpaths = scanner.nextInt();
		if (numberOfXpaths > 0) {
			String[] xpathArray = new String[numberOfXpaths];
			for (int i = 0; i < numberOfXpaths; i++) {
				xpathArray[i] = scanner.nextLine();
			}

			return xpathArray;

		} else {
			return null;
		}

  }


}

class JsonNode {

  private char name;
  private List<JsonNode> jsonNodes;
  private List<JsonLeafNode> jsonLeafNodes;

  public JsonNode() {
    super();
  }

  public JsonNode(char name) {
    this.name = name;
  }

  public JsonNode(char name, List<JsonNode> jsonNodes, List<JsonLeafNode> jsonLeafNodes) {
    this.name = name;
    this.jsonNodes = jsonNodes;
    this.jsonLeafNodes = jsonLeafNodes;
  }

  public void setJsonLeafNode(JsonLeafNode jsonLeafNode) {
    if (jsonLeafNodes == null) {
      jsonLeafNodes = new ArrayList<>();
      jsonLeafNodes.add(jsonLeafNode);
    } else {
      jsonLeafNodes.add(jsonLeafNode);
    }
  }

  public void setJsonNode(JsonNode jsonNode) {
    if (jsonNodes == null) {
      jsonNodes = new ArrayList<>();
      jsonNodes.add(jsonNode);
    } else {
      jsonNodes.add(jsonNode);
    }
  }

  public char getName() {
    return this.name;
  }

  public void setName(char name) {
    this.name = name;
  }

  public List<JsonNode> getJsonNodes() {
    return this.jsonNodes;
  }

  public List<JsonLeafNode> getJsonLeafNodes() {
    return this.jsonLeafNodes;
  }

}

class JsonLeafNode {

  private final char name;
  private final String value;

  JsonLeafNode(char name) {
    this.name = name;
    this.value = "";
  }

  JsonLeafNode(char name, String value) {
    this.name = name;
    this.value = value;
  }

}

class JsonMapper {

  JsonMapper() {
    super();
  }

  public JsonNode readTree(String[] xpathArray) {
    if (xpathArray.length == 0) {
      return null;
    } else {
      return null;

    }

  }

  public boolean existsJsonNode(char name, List<JsonNode> jsonNodes) {
    for (JsonNode tmp : jsonNodes) {
      if (name == tmp.getName()) {
        return true;
      }
    }
    return false;

  }

  public boolean existsNode(char name, JsonNode jsonNodeToCheck) {
    return jsonNodeToCheck != null;
  }


  public int getNumberOfSlash(String xpath) {
    int totalSlashes = 0;
		if (xpath == null) {
			return totalSlashes;
		} else {
			for (int i = 0; i < xpath.length(); i++) {
				totalSlashes += totalSlashes;
			}
			return totalSlashes;
		}
  }

}


class JsonBuilder {

  private JsonNode jsonNode;

  JsonBuilder() {
    super();
  }

  public JsonBuilder setRootNode(JsonNode jsonNode) {
    this.jsonNode = jsonNode;
    return this;
  }

  public String build() {
    if (jsonNode == null) {
      return "{}";
    } else {
      return "";
    }
  }
}


