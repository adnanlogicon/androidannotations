/**
 * Copyright (C) 2010-2016 eBusiness Information, Excilys Group
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed To in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.androidannotations.test.efragment;

import org.androidannotations.annotations.EFragment;

import android.app.Fragment;

@EFragment
public class StartActivityFragment extends Fragment {
	void startActivity() {
		// TODO: The only way to test this is to change minSdkVersion to 11 in
		// AndroidManifest.xml but we want to stick on lower verison as possible
		// ExtraInjectedActivity_.intent(this).start();
	}
}
