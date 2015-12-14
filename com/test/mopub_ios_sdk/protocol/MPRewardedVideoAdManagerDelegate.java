package com.test.mopub_ios_sdk.protocol;


import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCProtocolName;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.test.mopub_ios_sdk.MPRewardedVideoAdManager;
import com.test.mopub_ios_sdk.MPRewardedVideoReward;
import ios.foundation.NSError;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPRewardedVideoAdManagerDelegate")
public interface MPRewardedVideoAdManagerDelegate {
	@Generated
	@Selector("rewardedVideoDidAppearForAdManager:")
	void rewardedVideoDidAppearForAdManager(MPRewardedVideoAdManager manager);

	@Generated
	@Selector("rewardedVideoDidDisappearForAdManager:")
	void rewardedVideoDidDisappearForAdManager(MPRewardedVideoAdManager manager);

	@Generated
	@Selector("rewardedVideoDidExpireForAdManager:")
	void rewardedVideoDidExpireForAdManager(MPRewardedVideoAdManager manager);

	@Generated
	@Selector("rewardedVideoDidFailToLoadForAdManager:error:")
	void rewardedVideoDidFailToLoadForAdManagerError(
			MPRewardedVideoAdManager manager, NSError error);

	@Generated
	@Selector("rewardedVideoDidFailToPlayForAdManager:error:")
	void rewardedVideoDidFailToPlayForAdManagerError(
			MPRewardedVideoAdManager manager, NSError error);

	@Generated
	@Selector("rewardedVideoDidLoadForAdManager:")
	void rewardedVideoDidLoadForAdManager(MPRewardedVideoAdManager manager);

	@Generated
	@Selector("rewardedVideoDidReceiveTapEventForAdManager:")
	void rewardedVideoDidReceiveTapEventForAdManager(
			MPRewardedVideoAdManager manager);

	@Generated
	@Selector("rewardedVideoShouldRewardUserForAdManager:reward:")
	void rewardedVideoShouldRewardUserForAdManagerReward(
			MPRewardedVideoAdManager manager, MPRewardedVideoReward reward);

	@Generated
	@Selector("rewardedVideoWillAppearForAdManager:")
	void rewardedVideoWillAppearForAdManager(MPRewardedVideoAdManager manager);

	@Generated
	@Selector("rewardedVideoWillDisappearForAdManager:")
	void rewardedVideoWillDisappearForAdManager(MPRewardedVideoAdManager manager);

	@Generated
	@Selector("rewardedVideoWillLeaveApplicationForAdManager:")
	void rewardedVideoWillLeaveApplicationForAdManager(
			MPRewardedVideoAdManager manager);
}