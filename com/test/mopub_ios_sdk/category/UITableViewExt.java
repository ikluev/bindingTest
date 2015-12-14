package com.test.mopub_ios_sdk.category;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.ann.ByValue;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Mapped;
import com.intel.inde.moe.natj.general.ann.MappedReturn;
import com.intel.inde.moe.natj.general.ann.NInt;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCCategory;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import com.test.mopub_ios_sdk.MPTableViewAdPlacer;
import ios.coregraphics.struct.CGPoint;
import ios.coregraphics.struct.CGRect;
import ios.foundation.NSArray;
import ios.foundation.NSIndexPath;
import ios.foundation.NSIndexSet;
import ios.uikit.UITableView;
import ios.uikit.UITableViewCell;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCCategory(UITableView.class)
public final class UITableViewExt {
	static {
		NatJ.register();
	}

	@Generated
	private UITableViewExt() {
	}

	@Generated
	@Selector("mp_adPlacer")
	public static native MPTableViewAdPlacer mp_adPlacer(UITableView _object);

	@Generated
	@Selector("mp_beginUpdates")
	public static native void mp_beginUpdates(UITableView _object);

	@Generated
	@Selector("mp_cellForRowAtIndexPath:")
	public static native UITableViewCell mp_cellForRowAtIndexPath(
			UITableView _object, NSIndexPath indexPath);

	@Generated
	@Selector("mp_dataSource")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object mp_dataSource(UITableView _object);

	@Generated
	@Selector("mp_delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object mp_delegate(UITableView _object);

	@Generated
	@Selector("mp_deleteRowsAtIndexPaths:withRowAnimation:")
	public static native void mp_deleteRowsAtIndexPathsWithRowAnimation(
			UITableView _object, NSArray indexPaths, @NInt long animation);

	@Generated
	@Selector("mp_deleteSections:withRowAnimation:")
	public static native void mp_deleteSectionsWithRowAnimation(
			UITableView _object, NSIndexSet sections, @NInt long animation);

	@Generated
	@Selector("mp_dequeueReusableCellWithIdentifier:forIndexPath:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object mp_dequeueReusableCellWithIdentifierForIndexPath(
			UITableView _object, String identifier, NSIndexPath indexPath);

	@Generated
	@Selector("mp_deselectRowAtIndexPath:animated:")
	public static native void mp_deselectRowAtIndexPathAnimated(
			UITableView _object, NSIndexPath indexPath, boolean animated);

	@Generated
	@Selector("mp_endUpdates")
	public static native void mp_endUpdates(UITableView _object);

	@Generated
	@Selector("mp_indexPathForCell:")
	public static native NSIndexPath mp_indexPathForCell(UITableView _object,
			UITableViewCell cell);

	@Generated
	@Selector("mp_indexPathForRowAtPoint:")
	public static native NSIndexPath mp_indexPathForRowAtPoint(
			UITableView _object, @ByValue CGPoint point);

	@Generated
	@Selector("mp_indexPathForSelectedRow")
	public static native NSIndexPath mp_indexPathForSelectedRow(
			UITableView _object);

	@Generated
	@Selector("mp_indexPathsForRowsInRect:")
	public static native NSArray mp_indexPathsForRowsInRect(
			UITableView _object, @ByValue CGRect rect);

	@Generated
	@Selector("mp_indexPathsForSelectedRows")
	public static native NSArray mp_indexPathsForSelectedRows(
			UITableView _object);

	@Generated
	@Selector("mp_indexPathsForVisibleRows")
	public static native NSArray mp_indexPathsForVisibleRows(UITableView _object);

	@Generated
	@Selector("mp_insertRowsAtIndexPaths:withRowAnimation:")
	public static native void mp_insertRowsAtIndexPathsWithRowAnimation(
			UITableView _object, NSArray indexPaths, @NInt long animation);

	@Generated
	@Selector("mp_insertSections:withRowAnimation:")
	public static native void mp_insertSectionsWithRowAnimation(
			UITableView _object, NSIndexSet sections, @NInt long animation);

	@Generated
	@Selector("mp_moveRowAtIndexPath:toIndexPath:")
	public static native void mp_moveRowAtIndexPathToIndexPath(
			UITableView _object, NSIndexPath indexPath, NSIndexPath newIndexPath);

	@Generated
	@Selector("mp_moveSection:toSection:")
	public static native void mp_moveSectionToSection(UITableView _object,
			@NInt long section, @NInt long newSection);

	@Generated
	@Selector("mp_rectForRowAtIndexPath:")
	@ByValue
	public static native CGRect mp_rectForRowAtIndexPath(UITableView _object,
			NSIndexPath indexPath);

	@Generated
	@Selector("mp_reloadData")
	public static native void mp_reloadData(UITableView _object);

	@Generated
	@Selector("mp_reloadRowsAtIndexPaths:withRowAnimation:")
	public static native void mp_reloadRowsAtIndexPathsWithRowAnimation(
			UITableView _object, NSArray indexPaths, @NInt long animation);

	@Generated
	@Selector("mp_reloadSections:withRowAnimation:")
	public static native void mp_reloadSectionsWithRowAnimation(
			UITableView _object, NSIndexSet sections, @NInt long animation);

	@Generated
	@Selector("mp_scrollToRowAtIndexPath:atScrollPosition:animated:")
	public static native void mp_scrollToRowAtIndexPathAtScrollPositionAnimated(
			UITableView _object, NSIndexPath indexPath,
			@NInt long scrollPosition, boolean animated);

	@Generated
	@Selector("mp_selectRowAtIndexPath:animated:scrollPosition:")
	public static native void mp_selectRowAtIndexPathAnimatedScrollPosition(
			UITableView _object, NSIndexPath indexPath, boolean animated,
			@NInt long scrollPosition);

	@Generated
	@Selector("mp_setAdPlacer:")
	public static native void mp_setAdPlacer(UITableView _object,
			MPTableViewAdPlacer placer);

	@Generated
	@Selector("mp_setDataSource:")
	public static native void mp_setDataSource(UITableView _object,
			@Mapped(ObjCObjectMapper.class) Object dataSource);

	@Generated
	@Selector("mp_setDelegate:")
	public static native void mp_setDelegate(UITableView _object,
			@Mapped(ObjCObjectMapper.class) Object delegate);

	@Generated
	@Selector("mp_visibleCells")
	public static native NSArray mp_visibleCells(UITableView _object);
}