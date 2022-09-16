/*
 * Copyright (c) 2015-2017  Erik Derr [derr@cs.uni-saarland.de]
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this
 * file except in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under
 * the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package osu.seclab.libscope.manifest;

import java.io.InputStream;

/**
 * Interface to work on Manifest files
 */
public interface IManifestHandler {
	
	/**
	 * Process Android manifest files
	 * @param stream Input stream of manifest file
	 */
	public void handleManifest(InputStream stream);

}
