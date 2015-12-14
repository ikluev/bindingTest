package com.intel.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.ByValue;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.NInt;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import ios.coregraphics.struct.CGRect;
import ios.foundation.NSCoder;
import ios.uikit.UITableViewCell;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPTableViewAdPlacerCell extends UITableViewCell {
	static {
		NatJ.register();
	}

	@Generated
	protected MPTableViewAdPlacerCell(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPTableViewAdPlacerCell alloc();

	@Generated
	@Selector("init")
	public native MPTableViewAdPlacerCell init();

	@Generated
	@Selector("initWithCoder:")
	public native MPTableViewAdPlacerCell initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithFrame:")
	public native MPTableViewAdPlacerCell initWithFrame(@ByValue CGRect frame);

	@Generated
	@Deprecated
	@Selector("initWithFrame:reuseIdentifier:")
	public native MPTableViewAdPlacerCell initWithFrameReuseIdentifier(
			@ByValue CGRect frame, String reuseIdentifier);

	@Generated
	@Selector("initWithStyle:reuseIdentifier:")
	public native MPTableViewAdPlacerCell initWithStyleReuseIdentifier(
			@NInt long style, String reuseIdentifier);
}