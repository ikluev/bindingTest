package com.intel.mopub_ios_sdk.c;


import com.intel.inde.moe.natj.c.CRuntime;
import com.intel.inde.moe.natj.c.ann.CFunction;
import com.intel.inde.moe.natj.c.ann.CVariable;
import com.intel.inde.moe.natj.c.ann.Variadic;
import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.ann.ByValue;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Mapped;
import com.intel.inde.moe.natj.general.ann.MappedReturn;
import com.intel.inde.moe.natj.general.ann.NFloat;
import com.intel.inde.moe.natj.general.ann.NInt;
import com.intel.inde.moe.natj.general.ann.NUInt;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.general.ptr.ConstBytePtr;
import com.intel.inde.moe.natj.objc.Class;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import com.intel.inde.moe.natj.objc.map.ObjCStringMapper;
import com.intel.mopub_ios_sdk.MPLogEvent;
import ios.coregraphics.struct.CGRect;
import ios.coregraphics.struct.CGSize;
import ios.foundation.NSArray;
import ios.foundation.NSDictionary;
import ios.foundation.NSError;
import ios.uikit.UIView;
import ios.uikit.UIWindow;

@Generated
@Library("mopub_ios_sdk")
@Runtime(CRuntime.class)
public final class mopub_ios_sdk {
	static {
		NatJ.register();
	}

	@Generated
	private mopub_ios_sdk() {
	}

	@Generated
	@CFunction
	public static native NSError MPNativeAdNSErrorForInvalidAdServerResponse(
			@Mapped(ObjCStringMapper.class) String reason);

	@Generated
	@CFunction
	public static native NSError MPNativeAdNSErrorForAdUnitWarmingUp();

	@Generated
	@CFunction
	public static native NSError MPNativeAdNSErrorForNoInventory();

	@Generated
	@CFunction
	public static native NSError MPNativeAdNSErrorForNetworkConnectionError();

	@Generated
	@CFunction
	public static native NSError MPNativeAdNSErrorForInvalidImageURL();

	@Generated
	@CFunction
	public static native NSError MPNativeAdNSErrorForImageDownloadFailure();

	@Generated
	@CFunction
	public static native NSError MPNativeAdNSErrorForContentDisplayErrorMissingRootController();

	@Generated
	@CFunction
	public static native NSError MPNativeAdNSErrorForContentDisplayErrorInvalidURL();

	@Generated
	@CFunction
	public static native NSError MPNativeAdNSErrorForVASTParsingFailure();

	@Generated
	@CFunction
	public static native NSError MPNativeAdNSErrorForVideoConfigInvalid();

	@Generated
	@CFunction
	public static native NSError MPNativeAdNSErrorForRenderValueTypeError();

	@Generated
	@CFunction
	@NInt
	public static native long MPInterfaceOrientation();

	@Generated
	@CFunction
	public static native UIWindow MPKeyWindow();

	@Generated
	@CFunction
	@NFloat
	public static native double MPStatusBarHeight();

	@Generated
	@CFunction
	@ByValue
	public static native CGRect MPApplicationFrame();

	@Generated
	@CFunction
	@ByValue
	public static native CGRect MPScreenBounds();

	@Generated
	@CFunction
	@ByValue
	public static native CGSize MPScreenResolution();

	@Generated
	@CFunction
	@NFloat
	public static native double MPDeviceScaleFactor();

	@Generated
	@CFunction
	public static native NSDictionary MPDictionaryFromQueryString(
			@Mapped(ObjCStringMapper.class) String query);

	@Generated
	@CFunction
	@MappedReturn(ObjCStringMapper.class)
	public static native String MPSHA1Digest(
			@Mapped(ObjCStringMapper.class) String string);

	@Generated
	@CFunction
	public static native boolean MPViewIsVisible(UIView view);

	@Generated
	@CFunction
	public static native boolean MPViewIntersectsParentWindowWithPercent(
			UIView view, @NFloat double percentVisible);

	@Generated
	@CFunction
	@MappedReturn(ObjCStringMapper.class)
	public static native String MPResourcePathForResource(
			@Mapped(ObjCStringMapper.class) String resourceName);

	@Generated
	@CFunction
	public static native NSArray MPConvertStringArrayToURLArray(NSArray strArray);

	@Generated
	@CFunction
	@ByValue
	public static native CGRect MPClosableViewCustomCloseButtonFrame(
			@ByValue CGSize size, @NInt long closeButtonLocation);

	@Generated
	@CFunction
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object MPParseArrayOf(
			@Mapped(ObjCObjectMapper.class) Object internalMapper);

	@Generated
	@CFunction
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object MPParseURLFromString();

	@Generated
	@CFunction
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object MPParseNumberFromString(@NUInt long numberStyle);

	@Generated
	@CFunction
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object MPParseTimeIntervalFromDurationString();

	@Generated
	@CFunction
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object MPParseClass(Class destinationClass);

	@Generated
	@CFunction
	public static native void MPAddLogEvent(MPLogEvent event);

	@Generated
	@CFunction
	public static native int MPLogGetLevel();

	@Generated
	@CFunction
	public static native void MPLogSetLevel(int level);

	@Generated
	@Variadic()
	@CFunction
	public static native void _MPLogTrace(
			@Mapped(ObjCStringMapper.class) String format, Object... varargs);

	@Generated
	@Variadic()
	@CFunction
	public static native void _MPLogDebug(
			@Mapped(ObjCStringMapper.class) String format, Object... varargs);

	@Generated
	@Variadic()
	@CFunction
	public static native void _MPLogInfo(
			@Mapped(ObjCStringMapper.class) String format, Object... varargs);

	@Generated
	@Variadic()
	@CFunction
	public static native void _MPLogWarn(
			@Mapped(ObjCStringMapper.class) String format, Object... varargs);

	@Generated
	@Variadic()
	@CFunction
	public static native void _MPLogError(
			@Mapped(ObjCStringMapper.class) String format, Object... varargs);

	@Generated
	@Variadic()
	@CFunction
	public static native void _MPLogFatal(
			@Mapped(ObjCStringMapper.class) String format, Object... varargs);

	@Generated
	@CVariable()
	@ByValue
	public static native CGSize MOPUB_BANNER_SIZE();

	@Generated
	@CVariable()
	@ByValue
	public static native CGSize MOPUB_MEDIUM_RECT_SIZE();

	@Generated
	@CVariable()
	@ByValue
	public static native CGSize MOPUB_LEADERBOARD_SIZE();

	@Generated
	@CVariable()
	@ByValue
	public static native CGSize MOPUB_WIDE_SKYSCRAPER_SIZE();

	@Generated
	@CVariable()
	@NFloat
	public static native double kUniversalStarRatingScale();

	@Generated
	@CVariable()
	@NFloat
	public static native double kStarRatingMaxValue();

	@Generated
	@CVariable()
	@NFloat
	public static native double kStarRatingMinValue();

	@Generated
	@CVariable()
	public static native double kDefaultRequiredSecondsForImpression();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kAdTitleKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kAdTextKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kAdIconImageKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kAdMainImageKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kAdCTATextKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kAdStarRatingKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kVideoConfigKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kVASTVideoKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kNativeVideoAdConfigKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kAdDAAIconImageKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kDAAIconImageName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kDAAIconTapDestinationURL();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kImpressionTrackerURLsKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kDefaultActionURLKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kClickTrackerURLKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kLogEventRequestPropertiesKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String MoPubNativeAdsSDKDomain();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kMPRewardedVideoRewardCurrencyTypeUnspecified();

	@Generated
	@CVariable()
	@NInt
	public static native long kMPRewardedVideoRewardCurrencyAmountUnspecified();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String MoPubRewardedVideoAdsSDKDomain();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kAdTypeHeaderKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kAdUnitWarmingUpHeaderKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kClickthroughHeaderKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCreativeIdHeaderKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCustomSelectorHeaderKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCustomEventClassNameHeaderKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCustomEventClassDataHeaderKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kFailUrlHeaderKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kHeightHeaderKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kImpressionTrackerHeaderKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kInterceptLinksHeaderKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kLaunchpageHeaderKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kNativeSDKParametersHeaderKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kNetworkTypeHeaderKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kRefreshTimeHeaderKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kAdTimeoutHeaderKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kScrollableHeaderKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kWidthHeaderKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kDspCreativeIdKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kPrecacheRequiredKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kIsVastVideoPlayerKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kInterstitialAdTypeHeaderKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kOrientationTypeHeaderKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kAdTypeHtml();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kAdTypeInterstitial();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kAdTypeMraid();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kAdTypeClear();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kAdTypeNative();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kAdTypeNativeVideo();

	@Generated
	@CVariable()
	@NInt
	public static native long kMPAdAlertGestureMaxAllowedYAxisMovement();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String MPVASTTrackingEventTypeCreativeView();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String MPVASTTrackingEventTypeStart();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String MPVASTTrackingEventTypeFirstQuartile();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String MPVASTTrackingEventTypeMidpoint();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String MPVASTTrackingEventTypeThirdQuartile();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String MPVASTTrackingEventTypeComplete();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String MPVASTTrackingEventTypeMute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String MPVASTTrackingEventTypeUnmute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String MPVASTTrackingEventTypePause();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String MPVASTTrackingEventTypeRewind();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String MPVASTTrackingEventTypeResume();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String MPVASTTrackingEventTypeFullscreen();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String MPVASTTrackingEventTypeExitFullscreen();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String MPVASTTrackingEventTypeExpand();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String MPVASTTrackingEventTypeCollapse();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String MPVASTTrackingEventTypeAcceptInvitationLinear();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String MPVASTTrackingEventTypeCloseLinear();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String MPVASTTrackingEventTypeSkip();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String MPVASTTrackingEventTypeProgress();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String MPLogEventNameAdRequest();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String MPLogEventCategoryRequests();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String MPLogEventCategoryNativeVideo();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String MPRetryingHTTPOperationErrorDomain();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kOrientationPropertyForceOrientationPortraitKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kOrientationPropertyForceOrientationLandscapeKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kOrientationPropertyForceOrientationNoneKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String MoPubMRAIDAdsSDKDomain();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kMoPubHTTPHeaderContentType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kJavaScriptDisableDialogSnippet();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kMPErrorDomain();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kMPClearErrorLogFormatWithAdUnitID();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kMPWarmingUpErrorLogFormatWithAdUnitID();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kMPReachabilityChangedNotification();

	@Generated
	@CVariable()
	public static native double kUpdateVisibleCellsInterval();

	@Generated
	@CVariable()
	public static native double mopub_ios_sdkVersionNumber();

	@Generated
	@CVariable()
	public static native ConstBytePtr mopub_ios_sdkVersionString();
}