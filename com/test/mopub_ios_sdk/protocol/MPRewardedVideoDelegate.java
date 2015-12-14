package com.test.mopub_ios_sdk.protocol;


import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.IsOptional;
import com.intel.inde.moe.natj.objc.ann.ObjCProtocolName;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.test.mopub_ios_sdk.MPRewardedVideoReward;
import ios.foundation.NSError;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPRewardedVideoDelegate")
public interface MPRewardedVideoDelegate {
	@Generated
	@IsOptional
	@Selector("rewardedVideoAdDidAppearForAdUnitID:")
	default void rewardedVideoAdDidAppearForAdUnitID(String adUnitID) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("rewardedVideoAdDidDisappearForAdUnitID:")
	default void rewardedVideoAdDidDisappearForAdUnitID(String adUnitID) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("rewardedVideoAdDidExpireForAdUnitID:")
	default void rewardedVideoAdDidExpireForAdUnitID(String adUnitID) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("rewardedVideoAdDidFailToLoadForAdUnitID:error:")
	default void rewardedVideoAdDidFailToLoadForAdUnitIDError(String adUnitID,
			NSError error) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("rewardedVideoAdDidFailToPlayForAdUnitID:error:")
	default void rewardedVideoAdDidFailToPlayForAdUnitIDError(String adUnitID,
			NSError error) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("rewardedVideoAdDidLoadForAdUnitID:")
	default void rewardedVideoAdDidLoadForAdUnitID(String adUnitID) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("rewardedVideoAdDidReceiveTapEventForAdUnitID:")
	default void rewardedVideoAdDidReceiveTapEventForAdUnitID(String adUnitID) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("rewardedVideoAdShouldRewardForAdUnitID:reward:")
	default void rewardedVideoAdShouldRewardForAdUnitIDReward(String adUnitID,
			MPRewardedVideoReward reward) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("rewardedVideoAdWillAppearForAdUnitID:")
	default void rewardedVideoAdWillAppearForAdUnitID(String adUnitID) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("rewardedVideoAdWillDisappearForAdUnitID:")
	default void rewardedVideoAdWillDisappearForAdUnitID(String adUnitID) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("rewardedVideoAdWillLeaveApplicationForAdUnitID:")
	default void rewardedVideoAdWillLeaveApplicationForAdUnitID(String adUnitID) {
		throw new java.lang.UnsupportedOperationException();
	}
}