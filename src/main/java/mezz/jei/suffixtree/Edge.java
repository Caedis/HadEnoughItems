/*
 * Copyright 2012 Alessandro Bahgat Shehata
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package mezz.jei.suffixtree;

import java.io.Serializable;

/**
 * Represents an Edge in the Suffix Tree.
 * It has a label and a destination Node
 * <p>
 * Edited by mezz:
 * - formatting
 */
class Edge {

	private final Node dest;

	private String label;

	public Edge(String label, Node dest) {
		this.label = label;
		this.dest = dest;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Node getDest() {
		return dest;
	}

	@Override
	public String toString() {
		return "Edge: " + label;
	}

	public static class SerializableEdge implements Serializable {

		final String label;
		final int destNode;

		public SerializableEdge(Edge edge, int destNode) {
			this.label = edge.label;
			this.destNode = destNode;
		}
	}

}
