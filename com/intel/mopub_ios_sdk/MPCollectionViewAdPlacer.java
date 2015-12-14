package com.intel.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Mapped;
import com.intel.inde.moe.natj.general.ann.MappedReturn;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import com.intel.mopub_ios_sdk.protocol.MPCollectionViewAdPlacerDelegate;
import ios.NSObject;
import ios.foundation.NSArray;
import ios.uikit.UICollectionView;
import ios.uikit.UIViewController;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPCollectionViewAdPlacer extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MPCollectionViewAdPlacer(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPCollectionViewAdPlacer alloc();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native MPCollectionViewAdPlacerDelegate delegate();

	@Generated
	@Selector("init")
	public native MPCollectionViewAdPlacer init();

	@Generated
	@Selector("loadAdsForAdUnitID:")
	public native void loadAdsForAdUnitID(String adUnitID);

	@Generated
	@Selector("loadAdsForAdUnitID:targeting:")
	public native void loadAdsForAdUnitIDTargeting(String adUnitID,
			MPNativeAdRequestTargeting targeting);

	@Generated
	@Selector("placerWithCollectionView:viewController:adPositioning:rendererConfigurations:")
	public static native MPCollectionViewAdPlacer placerWithCollectionViewViewControllerAdPositioningRendererConfigurations(
			UICollectionView collectionView, UIViewController controller,
			MPAdPositioning positioning, NSArray rendererConfigurations);

	@Generated
	@Selector("placerWithCollectionView:viewController:rendererConfigurations:")
	public static native MPCollectionViewAdPlacer placerWithCollectionViewViewControllerRendererConfigurations(
			UICollectionView collectionView, UIViewController controller,
			NSArray rendererConfigurations);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) MPCollectionViewAdPlacerDelegate value);

	@Generated
	public void setDelegate(
			@Mapped(ObjCObjectMapper.class) MPCollectionViewAdPlacerDelegate value) {
		Object __old = delegate();
		if (value != null) {
			com.intel.inde.moe.natj.objc.ObjCRuntime.associateObjCObject(this,
					value);
		}
		setDelegate_unsafe(value);
		if (__old != null) {
			com.intel.inde.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this,
					__old);
		}
	}
}