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
import com.test.mopub_ios_sdk.MPRewardedVideoCustomEvent;
import com.test.mopub_ios_sdk.MPRewardedVideoReward;
import ios.foundation.NSError;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPRewardedVideoCustomEventDelegate")
public interface MPRewardedVideoCustomEventDelegate {
	@Generated
	@Selector("instanceMediationSettingsForClass:")
	@MappedReturn(ObjCObjectMapper.class)
	Object instanceMediationSettingsForClass(Class aClass);

	@Generated
	@Selector("rewardedVideoDidAppearForCustomEvent:")
	void rewardedVideoDidAppearForCustomEvent(
			MPRewardedVideoCustomEvent customEvent);

	@Generated
	@Selector("rewardedVideoDidDisappearForCustomEvent:")
	void rewardedVideoDidDisappearForCustomEvent(
			MPRewardedVideoCustomEvent customEvent);

	@Generated
	@Selector("rewardedVideoDidExpireForCustomEvent:")
	void rewardedVideoDidExpireForCustomEvent(
			MPRewardedVideoCustomEvent customEvent);

	@Generated
	@Selector("rewardedVideoDidFailToLoadAdForCustomEvent:error:")
	void rewardedVideoDidFailToLoadAdForCustomEventError(
			MPRewardedVideoCustomEvent customEvent, NSError error);

	@Generated
	@Selector("rewardedVideoDidFailToPlayForCustomEvent:error:")
	void rewardedVideoDidFailToPlayForCustomEventError(
			MPRewardedVideoCustomEvent customEvent, NSError error);

	@Generated
	@Selector("rewardedVideoDidLoadAdForCustomEvent:")
	void rewardedVideoDidLoadAdForCustomEvent(
			MPRewardedVideoCustomEvent customEvent);

	@Generated
	@Selector("rewardedVideoDidReceiveTapEventForCustomEvent:")
	void rewardedVideoDidReceiveTapEventForCustomEvent(
			MPRewardedVideoCustomEvent customEvent);

	@Generated
	@Selector("rewardedVideoShouldRewardUserForCustomEvent:reward:")
	void rewardedVideoShouldRewardUserForCustomEventReward(
			MPRewardedVideoCustomEvent customEvent, MPRewardedVideoReward reward);

	@Generated
	@Selector("rewardedVideoWillAppearForCustomEvent:")
	void rewardedVideoWillAppearForCustomEvent(
			MPRewardedVideoCustomEvent customEvent);

	@Generated
	@Selector("rewardedVideoWillDisappearForCustomEvent:")
	void rewardedVideoWillDisappearForCustomEvent(
			MPRewardedVideoCustomEvent customEvent);

	@Generated
	@Selector("rewardedVideoWillLeaveApplicationForCustomEvent:")
	void rewardedVideoWillLeaveApplicationForCustomEvent(
			MPRewardedVideoCustomEvent customEvent);

	@Generated
	@Selector("trackClick")
	void trackClick();

	@Generated
	@Selector("trackImpression")
	void trackImpression();
}