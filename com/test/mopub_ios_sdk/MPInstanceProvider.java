package com.test.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.ByValue;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Mapped;
import com.intel.inde.moe.natj.general.ann.MappedReturn;
import com.intel.inde.moe.natj.general.ann.NUInt;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.Class;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCBlock;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import com.test.mopub_ios_sdk.protocol.MPAdWebViewAgentDelegate;
import com.test.mopub_ios_sdk.protocol.MPBannerAdManagerDelegate;
import com.test.mopub_ios_sdk.protocol.MPBannerAdapterDelegate;
import com.test.mopub_ios_sdk.protocol.MPBannerCustomEventDelegate;
import com.test.mopub_ios_sdk.protocol.MPClosableViewDelegate;
import com.test.mopub_ios_sdk.protocol.MPInterstitialAdManagerDelegate;
import com.test.mopub_ios_sdk.protocol.MPInterstitialAdapterDelegate;
import com.test.mopub_ios_sdk.protocol.MPInterstitialCustomEventDelegate;
import com.test.mopub_ios_sdk.protocol.MPInterstitialViewControllerDelegate;
import com.test.mopub_ios_sdk.protocol.MPNativeAdSourceDelegate;
import com.test.mopub_ios_sdk.protocol.MPNativeCustomEventDelegate;
import com.test.mopub_ios_sdk.protocol.MPRewardedVideoAdManagerDelegate;
import com.test.mopub_ios_sdk.protocol.MPRewardedVideoAdapterDelegate;
import com.test.mopub_ios_sdk.protocol.MPRewardedVideoCustomEventDelegate;
import com.test.mopub_ios_sdk.protocol.MRBridgeDelegate;
import com.test.mopub_ios_sdk.protocol.MRCalendarManagerDelegate;
import com.test.mopub_ios_sdk.protocol.MRControllerDelegate;
import com.test.mopub_ios_sdk.protocol.MRImageDownloaderDelegate;
import com.test.mopub_ios_sdk.protocol.MRNativeCommandHandlerDelegate;
import com.test.mopub_ios_sdk.protocol.MRPictureManagerDelegate;
import com.test.mopub_ios_sdk.protocol.MRVideoPlayerManagerDelegate;
import ios.NSObject;
import ios.coregraphics.struct.CGRect;
import ios.eventkit.EKEventStore;
import ios.eventkitui.EKEventEditViewController;
import ios.eventkitui.protocol.EKEventEditViewDelegate;
import ios.foundation.NSArray;
import ios.foundation.NSURL;
import ios.mediaplayer.MPMoviePlayerViewController;
import ios.uikit.UIViewController;
import ios.uikit.UIWebView;
import ios.uikit.protocol.UIWebViewDelegate;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPInstanceProvider extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MPInstanceProvider(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPInstanceProvider alloc();

	@Generated
	@Selector("buildBannerAdapterForConfiguration:delegate:")
	public native MPBaseBannerAdapter buildBannerAdapterForConfigurationDelegate(
			MPAdConfiguration configuration,
			@Mapped(ObjCObjectMapper.class) MPBannerAdapterDelegate delegate);

	@Generated
	@Selector("buildBannerCustomEventFromCustomClass:delegate:")
	public native MPBannerCustomEvent buildBannerCustomEventFromCustomClassDelegate(
			Class customClass,
			@Mapped(ObjCObjectMapper.class) MPBannerCustomEventDelegate delegate);

	@Generated
	@Selector("buildBannerMRControllerWithFrame:delegate:")
	public native MRController buildBannerMRControllerWithFrameDelegate(
			@ByValue CGRect frame,
			@Mapped(ObjCObjectMapper.class) MRControllerDelegate delegate);

	@Generated
	@Selector("buildEKEventEditViewControllerWithEditViewDelegate:")
	public native EKEventEditViewController buildEKEventEditViewControllerWithEditViewDelegate(
			@Mapped(ObjCObjectMapper.class) EKEventEditViewDelegate editViewDelegate);

	@Generated
	@Selector("buildEKEventStore")
	public native EKEventStore buildEKEventStore();

	@Generated
	@Selector("buildInterstitialAdapterForConfiguration:delegate:")
	public native MPBaseInterstitialAdapter buildInterstitialAdapterForConfigurationDelegate(
			MPAdConfiguration configuration,
			@Mapped(ObjCObjectMapper.class) MPInterstitialAdapterDelegate delegate);

	@Generated
	@Selector("buildInterstitialCustomEventFromCustomClass:delegate:")
	public native MPInterstitialCustomEvent buildInterstitialCustomEventFromCustomClassDelegate(
			Class customClass,
			@Mapped(ObjCObjectMapper.class) MPInterstitialCustomEventDelegate delegate);

	@Generated
	@Selector("buildInterstitialMRControllerWithFrame:delegate:")
	public native MRController buildInterstitialMRControllerWithFrameDelegate(
			@ByValue CGRect frame,
			@Mapped(ObjCObjectMapper.class) MRControllerDelegate delegate);

	@Generated
	@Selector("buildMPAdWebViewAgentWithAdWebViewFrame:delegate:")
	public native MPAdWebViewAgent buildMPAdWebViewAgentWithAdWebViewFrameDelegate(
			@ByValue CGRect frame,
			@Mapped(ObjCObjectMapper.class) MPAdWebViewAgentDelegate delegate);

	@Generated
	@Selector("buildMPAdWebViewWithFrame:delegate:")
	public native MPAdWebView buildMPAdWebViewWithFrameDelegate(
			@ByValue CGRect frame,
			@Mapped(ObjCObjectMapper.class) UIWebViewDelegate delegate);

	@Generated
	@Selector("buildMPBannerAdManagerWithDelegate:")
	public native MPBannerAdManager buildMPBannerAdManagerWithDelegate(
			@Mapped(ObjCObjectMapper.class) MPBannerAdManagerDelegate delegate);

	@Generated
	@Selector("buildMPHTMLInterstitialViewControllerWithDelegate:orientationType:")
	public native MPHTMLInterstitialViewController buildMPHTMLInterstitialViewControllerWithDelegateOrientationType(
			@Mapped(ObjCObjectMapper.class) MPInterstitialViewControllerDelegate delegate,
			@NUInt long type);

	@Generated
	@Selector("buildMPInterstitialAdManagerWithDelegate:")
	public native MPInterstitialAdManager buildMPInterstitialAdManagerWithDelegate(
			@Mapped(ObjCObjectMapper.class) MPInterstitialAdManagerDelegate delegate);

	@Generated
	@Selector("buildMPMRAIDInterstitialViewControllerWithDelegate:configuration:")
	public native MPMRAIDInterstitialViewController buildMPMRAIDInterstitialViewControllerWithDelegateConfiguration(
			@Mapped(ObjCObjectMapper.class) MPInterstitialViewControllerDelegate delegate,
			MPAdConfiguration configuration);

	@Generated
	@Selector("buildMPMoviePlayerViewControllerWithURL:")
	public native MPMoviePlayerViewController buildMPMoviePlayerViewControllerWithURL(
			NSURL URL);

	@Generated
	@Selector("buildMRAIDMPClosableViewWithFrame:webView:delegate:")
	public native MPClosableView buildMRAIDMPClosableViewWithFrameWebViewDelegate(
			@ByValue CGRect frame, UIWebView webView,
			@Mapped(ObjCObjectMapper.class) MPClosableViewDelegate delegate);

	@Generated
	@Selector("buildMRBridgeWithWebView:delegate:")
	public native MRBridge buildMRBridgeWithWebViewDelegate(UIWebView webView,
			@Mapped(ObjCObjectMapper.class) MRBridgeDelegate delegate);

	@Generated
	@Selector("buildMRBundleManager")
	public native MRBundleManager buildMRBundleManager();

	@Generated
	@Selector("buildMRCalendarManagerWithDelegate:")
	public native MRCalendarManager buildMRCalendarManagerWithDelegate(
			@Mapped(ObjCObjectMapper.class) MRCalendarManagerDelegate delegate);

	@Generated
	@Selector("buildMRImageDownloaderWithDelegate:")
	public native MRImageDownloader buildMRImageDownloaderWithDelegate(
			@Mapped(ObjCObjectMapper.class) MRImageDownloaderDelegate delegate);

	@Generated
	@Selector("buildMRNativeCommandHandlerWithDelegate:")
	public native MRNativeCommandHandler buildMRNativeCommandHandlerWithDelegate(
			@Mapped(ObjCObjectMapper.class) MRNativeCommandHandlerDelegate delegate);

	@Generated
	@Selector("buildMRPictureManagerWithDelegate:")
	public native MRPictureManager buildMRPictureManagerWithDelegate(
			@Mapped(ObjCObjectMapper.class) MRPictureManagerDelegate delegate);

	@Generated
	@Selector("buildMRVideoPlayerManagerWithDelegate:")
	public native MRVideoPlayerManager buildMRVideoPlayerManagerWithDelegate(
			@Mapped(ObjCObjectMapper.class) MRVideoPlayerManagerDelegate delegate);

	@Generated
	@Selector("buildNativeAdSourceWithDelegate:")
	public native MPNativeAdSource buildNativeAdSourceWithDelegate(
			@Mapped(ObjCObjectMapper.class) MPNativeAdSourceDelegate delegate);

	@Generated
	@Selector("buildNativeCustomEventFromCustomClass:delegate:")
	public native MPNativeCustomEvent buildNativeCustomEventFromCustomClassDelegate(
			Class customClass,
			@Mapped(ObjCObjectMapper.class) MPNativeCustomEventDelegate delegate);

	@Generated
	@Selector("buildNativePositioningSource")
	public native MPNativePositionSource buildNativePositioningSource();

	@Generated
	@Selector("buildRewardedVideoAdManagerWithAdUnitID:delegate:")
	public native MPRewardedVideoAdManager buildRewardedVideoAdManagerWithAdUnitIDDelegate(
			String adUnitID,
			@Mapped(ObjCObjectMapper.class) MPRewardedVideoAdManagerDelegate delegate);

	@Generated
	@Selector("buildRewardedVideoAdapterWithDelegate:")
	public native MPRewardedVideoAdapter buildRewardedVideoAdapterWithDelegate(
			@Mapped(ObjCObjectMapper.class) MPRewardedVideoAdapterDelegate delegate);

	@Generated
	@Selector("buildRewardedVideoCustomEventFromCustomClass:delegate:")
	public native MPRewardedVideoCustomEvent buildRewardedVideoCustomEventFromCustomClassDelegate(
			Class customClass,
			@Mapped(ObjCObjectMapper.class) MPRewardedVideoCustomEventDelegate delegate);

	@Generated
	@Selector("buildStreamAdPlacementDataWithPositioning:")
	public native MPStreamAdPlacementData buildStreamAdPlacementDataWithPositioning(
			MPAdPositioning positioning);

	@Generated
	@Selector("buildStreamAdPlacerWithViewController:adPositioning:rendererConfigurations:")
	public native MPStreamAdPlacer buildStreamAdPlacerWithViewControllerAdPositioningRendererConfigurations(
			UIViewController controller, MPAdPositioning positioning,
			NSArray rendererConfigurations);

	@Generated
	@Selector("buildUIWebViewWithFrame:")
	public native UIWebView buildUIWebViewWithFrame(@ByValue CGRect frame);

	@Generated
	@Selector("init")
	public native MPInstanceProvider init();

	@Generated
	@Selector("sharedProvider")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object sharedProvider();

	@Generated
	@Selector("singletonForClass:provider:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object singletonForClassProvider(
			Class klass,
			@ObjCBlock(name = "call_singletonForClassProvider") Block_singletonForClassProvider provider);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_singletonForClassProvider {
		@Generated
		@MappedReturn(ObjCObjectMapper.class)
		Object call_singletonForClassProvider();
	}

	@Generated
	@Selector("singletonForClass:provider:context:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object singletonForClassProviderContext(
			Class klass,
			@ObjCBlock(name = "call_singletonForClassProviderContext") Block_singletonForClassProviderContext provider,
			@Mapped(ObjCObjectMapper.class) Object context);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_singletonForClassProviderContext {
		@Generated
		@MappedReturn(ObjCObjectMapper.class)
		Object call_singletonForClassProviderContext();
	}
}