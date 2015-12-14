package com.intel.mopub_ios_sdk.protocol;


import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCProtocolName;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.mopub_ios_sdk.MOPUBAVPlayer;
import ios.foundation.NSError;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MOPUBAVPlayerDelegate")
public interface MOPUBAVPlayerDelegate {
	@Generated
	@Selector("avPlayer:didError:withMessage:")
	void avPlayerDidErrorWithMessage(MOPUBAVPlayer player, NSError error,
			String message);

	@Generated
	@Selector("avPlayer:playbackTimeDidProgress:")
	void avPlayerPlaybackTimeDidProgress(MOPUBAVPlayer player,
			double currentPlaybackTime);

	@Generated
	@Selector("avPlayerDidFinishPlayback:")
	void avPlayerDidFinishPlayback(MOPUBAVPlayer player);

	@Generated
	@Selector("avPlayerDidRecoverFromStall:")
	void avPlayerDidRecoverFromStall(MOPUBAVPlayer player);

	@Generated
	@Selector("avPlayerDidStall:")
	void avPlayerDidStall(MOPUBAVPlayer player);
}