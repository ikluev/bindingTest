package com.test.mopub_ios_sdk.protocol;


import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.IsOptional;
import com.intel.inde.moe.natj.objc.ann.ObjCProtocolName;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.test.mopub_ios_sdk.MOPUBAVPlayer;
import com.test.mopub_ios_sdk.MOPUBPlayerView;
import com.test.mopub_ios_sdk.MOPUBPlayerViewController;
import ios.uikit.UIViewController;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MOPUBPlayerViewControllerDelegate")
public interface MOPUBPlayerViewControllerDelegate {
	@Generated
	@IsOptional
	@Selector("playerDidProgressToTime:")
	default void playerDidProgressToTime(double playbackTime) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("playerPlaybackDidStart:")
	default void playerPlaybackDidStart(MOPUBPlayerViewController player) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("playerPlaybackWillStart:")
	default void playerPlaybackWillStart(MOPUBPlayerViewController player) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("playerViewController:didRecoverFromStall:")
	default void playerViewControllerDidRecoverFromStall(
			MOPUBPlayerViewController playerViewController, MOPUBAVPlayer player) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("playerViewController:didStall:")
	default void playerViewControllerDidStall(
			MOPUBPlayerViewController playerViewController, MOPUBAVPlayer player) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("playerViewController:didTapReplayButton:")
	default void playerViewControllerDidTapReplayButton(
			MOPUBPlayerViewController playerViewController, MOPUBPlayerView view) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("playerViewController:willShowReplayView:")
	default void playerViewControllerWillShowReplayView(
			MOPUBPlayerViewController playerViewController, MOPUBPlayerView view) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("viewControllerForPresentingModalView")
	default UIViewController viewControllerForPresentingModalView() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("willEnterFullscreen:")
	default void willEnterFullscreen(MOPUBPlayerViewController viewController) {
		throw new java.lang.UnsupportedOperationException();
	}
}