package com.test.mopub_ios_sdk.protocol;


import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.MappedReturn;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.Class;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCProtocolName;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import com.test.mopub_ios_sdk.MPRewardedVideoAdapter;
import com.test.mopub_ios_sdk.MPRewardedVideoReward;
import ios.foundation.NSError;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPRewardedVideoAdapterDelegate")
public interface MPRewardedVideoAdapterDelegate {
	@Generated
	@Selector("instanceMediationSettingsForClass:")
	@MappedReturn(ObjCObjectMapper.class)
	Object instanceMediationSettingsForClass(Class aClass);

	@Generated
	@Selector("rewardedVideoDidAppearForAdapter:")
	void rewardedVideoDidAppearForAdapter(MPRewardedVideoAdapter adapter);

	@Generated
	@Selector("rewardedVideoDidDisappearForAdapter:")
	void rewardedVideoDidDisappearForAdapter(MPRewardedVideoAdapter adapter);

	@Generated
	@Selector("rewardedVideoDidExpireForAdapter:")
	void rewardedVideoDidExpireForAdapter(MPRewardedVideoAdapter adapter);

	@Generated
	@Selector("rewardedVideoDidFailToLoadForAdapter:error:")
	void rewardedVideoDidFailToLoadForAdapterError(
			MPRewardedVideoAdapter adapter, NSError error);

	@Generated
	@Selector("rewardedVideoDidFailToPlayForAdapter:error:")
	void rewardedVideoDidFailToPlayForAdapterError(
			MPRewardedVideoAdapter adapter, NSError error);

	@Generated
	@Selector("rewardedVideoDidLoadForAdapter:")
	void rewardedVideoDidLoadForAdapter(MPRewardedVideoAdapter adapter);

	@Generated
	@Selector("rewardedVideoDidReceiveTapEventForAdapter:")
	void rewardedVideoDidReceiveTapEventForAdapter(
			MPRewardedVideoAdapter adapter);

	@Generated
	@Selector("rewardedVideoShouldRewardUserForAdapter:reward:")
	void rewardedVideoShouldRewardUserForAdapterReward(
			MPRewardedVideoAdapter adapter, MPRewardedVideoReward reward);

	@Generated
	@Selector("rewardedVideoWillAppearForAdapter:")
	void rewardedVideoWillAppearForAdapter(MPRewardedVideoAdapter adapter);

	@Generated
	@Selector("rewardedVideoWillDisappearForAdapter:")
	void rewardedVideoWillDisappearForAdapter(MPRewardedVideoAdapter adapter);

	@Generated
	@Selector("rewardedVideoWillLeaveApplicationForAdapter:")
	void rewardedVideoWillLeaveApplicationForAdapter(
			MPRewardedVideoAdapter adapter);
}