package com.intel.mopub_ios_sdk.protocol;


import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCProtocolName;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.mopub_ios_sdk.MOPUBPlayerView;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MOPUBPlayerViewDelegate")
public interface MOPUBPlayerViewDelegate {
	@Generated
	@Selector("playerViewDidTapReplayButton:")
	void playerViewDidTapReplayButton(MOPUBPlayerView view);

	@Generated
	@Selector("playerViewWillEnterFullscreen:")
	void playerViewWillEnterFullscreen(MOPUBPlayerView view);

	@Generated
	@Selector("playerViewWillShowReplayView:")
	void playerViewWillShowReplayView(MOPUBPlayerView view);
}