/*
 * Copyright 2009-2011 Collaborative Research Centre SFB 632 
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package annis.sqlgen;

import org.apache.commons.lang.NotImplementedException;

import annis.model.AnnisNode;

public class TableAccessStrategyFactory {

	public TableAccessStrategy tables(AnnisNode node) {
		TableAccessStrategy tableAccessStrategy = createTableAccessStrategy();
		tableAccessStrategy.setNode(node);
		return tableAccessStrategy;
	}
	
	protected TableAccessStrategy createTableAccessStrategy() {
		throw new NotImplementedException("BUG: This method needs to be overwritten by ancestors or through Spring");
	}

}
