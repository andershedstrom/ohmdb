package com.ohmdb.impl;

/*
 * #%L
 * ohmdb-core
 * %%
 * Copyright (C) 2013 - 2014 Nikolche Mihajlovski
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import com.ohmdb.abstracts.ComplexIndex;
import com.ohmdb.abstracts.Index;
import com.ohmdb.api.CustomIndex;

public class IndexerImpl<E, T> implements CustomIndex<E, T> {

	@SuppressWarnings("unused")
	private final ComplexIndex<E> complexIndex;

	private final Index index;

	public IndexerImpl(ComplexIndex<E> complexIndex, Index index) {
		this.complexIndex = complexIndex;
		this.index = index;
	}

	public Index getIndex() {
		return index;
	}

}
