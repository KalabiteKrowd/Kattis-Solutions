import java.util.*;

public class ColoringGraphs {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		nodeCount = input.nextInt();
		Node[] nodes = new Node[nodeCount];
	}

	class Node {
		int[] neighbors;
		int color;
		Node parent;

		public Node(int[] neighbors) {
			this.neighbors = neighbors;
		}

		public Node[] getNeighbors() {
			return neighbors;
		}

		public Node getParent() {
			return parent;
		}

		public void setColor(int color) {
			this.color = color;
		}

		public int getColor() {
			return color;
		}

	}//inner node class

}
