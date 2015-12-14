package com.test.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.ByValue;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.NInt;
import com.intel.inde.moe.natj.general.ann.NUInt;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import ios.NSObject;
import ios.foundation.NSArray;
import ios.foundation.NSIndexPath;
import ios.foundation.NSIndexSet;
import ios.foundation.struct.NSRange;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPStreamAdPlacementData extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MPStreamAdPlacementData(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("adDataAtAdjustedIndexPath:")
	public native MPNativeAdData adDataAtAdjustedIndexPath(
			NSIndexPath adjustedIndexPath);

	@Generated
	@Selector("adjustedAdIndexPathsInAdjustedRange:inSection:")
	public native NSArray adjustedAdIndexPathsInAdjustedRangeInSection(
			@ByValue NSRange range, @NInt long section);

	@Generated
	@Selector("adjustedIndexPathForOriginalIndexPath:")
	public native NSIndexPath adjustedIndexPathForOriginalIndexPath(
			NSIndexPath indexPath);

	@Generated
	@Selector("adjustedIndexPathsWithAdsInSection:")
	public native NSArray adjustedIndexPathsWithAdsInSection(@NUInt long section);

	@Generated
	@Selector("adjustedNumberOfItems:inSection:")
	@NUInt
	public native long adjustedNumberOfItemsInSection(
			@NUInt long numberOfItems, @NUInt long section);

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPStreamAdPlacementData alloc();

	@Generated
	@Selector("clearAdsInAdjustedRange:inSection:")
	public native void clearAdsInAdjustedRangeInSection(@ByValue NSRange range,
			@NInt long section);

	@Generated
	@Selector("deleteItemsAtIndexPaths:")
	public native void deleteItemsAtIndexPaths(NSArray originalIndexPaths);

	@Generated
	@Selector("deleteSections:")
	public native void deleteSections(NSIndexSet sections);

	@Generated
	@Selector("init")
	public native MPStreamAdPlacementData init();

	@Generated
	@Selector("initWithPositioning:")
	public native MPStreamAdPlacementData initWithPositioning(
			MPAdPositioning positioning);

	@Generated
	@Selector("insertAdData:atIndexPath:")
	public native void insertAdDataAtIndexPath(MPNativeAdData data,
			NSIndexPath adjustedIndexPath);

	@Generated
	@Selector("insertItemsAtIndexPaths:")
	public native void insertItemsAtIndexPaths(NSArray originalIndexPaths);

	@Generated
	@Selector("insertSections:")
	public native void insertSections(NSIndexSet sections);

	@Generated
	@Selector("isAdAtAdjustedIndexPath:")
	public native boolean isAdAtAdjustedIndexPath(NSIndexPath adjustedIndexPath);

	@Generated
	@Selector("moveItemAtIndexPath:toIndexPath:")
	public native void moveItemAtIndexPathToIndexPath(
			NSIndexPath originalIndexPath, NSIndexPath newIndexPath);

	@Generated
	@Selector("moveSection:toSection:")
	public native void moveSectionToSection(@NInt long section,
			@NInt long newSection);

	@Generated
	@Selector("nextAdInsertionIndexPathForAdjustedIndexPath:")
	public native NSIndexPath nextAdInsertionIndexPathForAdjustedIndexPath(
			NSIndexPath adjustedIndexPath);

	@Generated
	@Selector("originalIndexPathForAdjustedIndexPath:")
	public native NSIndexPath originalIndexPathForAdjustedIndexPath(
			NSIndexPath indexPath);

	@Generated
	@Selector("previousAdInsertionIndexPathForAdjustedIndexPath:")
	public native NSIndexPath previousAdInsertionIndexPathForAdjustedIndexPath(
			NSIndexPath adjustedIndexPath);
}