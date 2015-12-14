package com.intel.mopub_ios_sdk.protocol;


import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.IsOptional;
import com.intel.inde.moe.natj.objc.ann.ObjCProtocolName;
import com.intel.inde.moe.natj.objc.ann.ProtocolClassMethod;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.mopub_ios_sdk.MPNativeAdRenderingImageLoader;
import ios.foundation.NSDictionary;
import ios.foundation.NSNumber;
import ios.uikit.UIImageView;
import ios.uikit.UILabel;
import ios.uikit.UINib;
import ios.uikit.UIView;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPNativeAdRendering")
public interface MPNativeAdRendering {
	@Generated
	@IsOptional
	@Selector("layoutCustomAssetsWithProperties:imageLoader:")
	default void layoutCustomAssetsWithPropertiesImageLoader(
			NSDictionary customProperties,
			MPNativeAdRenderingImageLoader imageLoader) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("layoutStarRating:")
	default void layoutStarRating(NSNumber starRating) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("nativeCallToActionTextLabel")
	default UILabel nativeCallToActionTextLabel() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("nativeIconImageView")
	default UIImageView nativeIconImageView() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("nativeMainImageView")
	default UIImageView nativeMainImageView() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("nativeMainTextLabel")
	default UILabel nativeMainTextLabel() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("nativePrivacyInformationIconImageView")
	default UIImageView nativePrivacyInformationIconImageView() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("nativeTitleTextLabel")
	default UILabel nativeTitleTextLabel() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("nativeVideoView")
	default UIView nativeVideoView() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("nibForAd")
	@ProtocolClassMethod("nibForAd")
	default UINib _nibForAd() {
		throw new java.lang.UnsupportedOperationException();
	}
}