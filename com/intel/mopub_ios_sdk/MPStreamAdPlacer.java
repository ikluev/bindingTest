package com.intel.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.ByValue;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Mapped;
import com.intel.inde.moe.natj.general.ann.MappedReturn;
import com.intel.inde.moe.natj.general.ann.NFloat;
import com.intel.inde.moe.natj.general.ann.NInt;
import com.intel.inde.moe.natj.general.ann.NUInt;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import com.intel.mopub_ios_sdk.protocol.MPStreamAdPlacerDelegate;
import ios.NSObject;
import ios.coregraphics.struct.CGSize;
import ios.foundation.NSArray;
import ios.foundation.NSIndexPath;
import ios.foundation.NSIndexSet;
import ios.uikit.UIView;
import ios.uikit.UIViewController;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPStreamAdPlacer extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MPStreamAdPlacer(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("adPositioning")
	public native MPAdPositioning adPositioning();

	@Generated
	@Selector("adjustedIndexPathForOriginalIndexPath:")
	public native NSIndexPath adjustedIndexPathForOriginalIndexPath(
			NSIndexPath indexPath);

	@Generated
	@Selector("adjustedIndexPathsForOriginalIndexPaths:")
	public native NSArray adjustedIndexPathsForOriginalIndexPaths(
			NSArray indexPaths);

	@Generated
	@Selector("adjustedNumberOfItems:inSection:")
	@NUInt
	public native long adjustedNumberOfItemsInSection(
			@NUInt long numberOfItems, @NUInt long section);

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPStreamAdPlacer alloc();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native MPStreamAdPlacerDelegate delegate();

	@Generated
	@Selector("deleteItemsAtIndexPaths:")
	public native void deleteItemsAtIndexPaths(NSArray originalIndexPaths);

	@Generated
	@Selector("deleteSections:")
	public native void deleteSections(NSIndexSet sections);

	@Generated
	@Selector("init")
	public native MPStreamAdPlacer init();

	@Generated
	@Selector("insertItemsAtIndexPaths:")
	public native void insertItemsAtIndexPaths(NSArray originalIndexPaths);

	@Generated
	@Selector("insertSections:")
	public native void insertSections(NSIndexSet sections);

	@Generated
	@Selector("isAdAtIndexPath:")
	public native boolean isAdAtIndexPath(NSIndexPath indexPath);

	@Generated
	@Selector("loadAdsForAdUnitID:")
	public native void loadAdsForAdUnitID(String adUnitID);

	@Generated
	@Selector("loadAdsForAdUnitID:targeting:")
	public native void loadAdsForAdUnitIDTargeting(String adUnitID,
			MPNativeAdRequestTargeting targeting);

	@Generated
	@Selector("moveItemAtIndexPath:toIndexPath:")
	public native void moveItemAtIndexPathToIndexPath(
			NSIndexPath fromIndexPath, NSIndexPath toIndexPath);

	@Generated
	@Selector("moveSection:toSection:")
	public native void moveSectionToSection(@NInt long section,
			@NInt long newSection);

	@Generated
	@Selector("originalIndexPathForAdjustedIndexPath:")
	public native NSIndexPath originalIndexPathForAdjustedIndexPath(
			NSIndexPath indexPath);

	@Generated
	@Selector("originalIndexPathsForAdjustedIndexPaths:")
	public native NSArray originalIndexPathsForAdjustedIndexPaths(
			NSArray indexPaths);

	@Generated
	@Selector("placerWithViewController:adPositioning:rendererConfigurations:")
	public static native MPStreamAdPlacer placerWithViewControllerAdPositioningRendererConfigurations(
			UIViewController controller, MPAdPositioning positioning,
			NSArray rendererConfigurations);

	@Generated
	@Selector("renderAdAtIndexPath:inView:")
	public native void renderAdAtIndexPathInView(NSIndexPath indexPath,
			UIView view);

	@Generated
	@Selector("rendererConfigurations")
	public native NSArray rendererConfigurations();

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) MPStreamAdPlacerDelegate value);

	@Generated
	public void setDelegate(
			@Mapped(ObjCObjectMapper.class) MPStreamAdPlacerDelegate value) {
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

	@Generated
	@Selector("setItemCount:forSection:")
	public native void setItemCountForSection(@NUInt long count,
			@NInt long section);

	@Generated
	@Selector("setViewController:")
	public native void setViewController_unsafe(UIViewController value);

	@Generated
	public void setViewController(UIViewController value) {
		Object __old = viewController();
		if (value != null) {
			com.intel.inde.moe.natj.objc.ObjCRuntime.associateObjCObject(this,
					value);
		}
		setViewController_unsafe(value);
		if (__old != null) {
			com.intel.inde.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this,
					__old);
		}
	}

	@Generated
	@Selector("setVisibleIndexPaths:")
	public native void setVisibleIndexPaths(NSArray value);

	@Generated
	@Selector("sizeForAdAtIndexPath:withMaximumWidth:")
	@ByValue
	public native CGSize sizeForAdAtIndexPathWithMaximumWidth(
			NSIndexPath indexPath, @NFloat double maxWidth);

	@Generated
	@Selector("viewController")
	public native UIViewController viewController();

	@Generated
	@Selector("visibleIndexPaths")
	public native NSArray visibleIndexPaths();
}