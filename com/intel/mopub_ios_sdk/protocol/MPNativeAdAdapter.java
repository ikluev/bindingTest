package com.intel.mopub_ios_sdk.protocol;


import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Mapped;
import com.intel.inde.moe.natj.general.ann.MappedReturn;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.IsOptional;
import com.intel.inde.moe.natj.objc.ann.ObjCProtocolName;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import ios.foundation.NSDictionary;
import ios.foundation.NSURL;
import ios.uikit.UIView;
import ios.uikit.UIViewController;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPNativeAdAdapter")
public interface MPNativeAdAdapter {
	@Generated
	@Selector("defaultActionURL")
	NSURL defaultActionURL();

	@Generated
	@IsOptional
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	default Object delegate() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("displayContentForDAAIconTap")
	default void displayContentForDAAIconTap() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("displayContentForURL:rootViewController:")
	default void displayContentForURLRootViewController(NSURL URL,
			UIViewController controller) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("enableThirdPartyClickTracking")
	default boolean enableThirdPartyClickTracking() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("mainMediaView")
	default UIView mainMediaView() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("privacyInformationIconView")
	default UIView privacyInformationIconView() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@Selector("properties")
	NSDictionary properties();

	@Generated
	@IsOptional
	@Selector("setDelegate:")
	default void setDelegate(@Mapped(ObjCObjectMapper.class) Object value) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("trackClick")
	default void trackClick() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("willAttachToView:")
	default void willAttachToView(UIView view) {
		throw new java.lang.UnsupportedOperationException();
	}
}