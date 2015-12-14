package com.test.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.ByValue;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import ios.coregraphics.struct.CGRect;
import ios.foundation.NSCoder;
import ios.uikit.UICollectionViewCell;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPCollectionViewAdPlacerCell extends UICollectionViewCell {
	static {
		NatJ.register();
	}

	@Generated
	protected MPCollectionViewAdPlacerCell(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPCollectionViewAdPlacerCell alloc();

	@Generated
	@Selector("init")
	public native MPCollectionViewAdPlacerCell init();

	@Generated
	@Selector("initWithCoder:")
	public native MPCollectionViewAdPlacerCell initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithFrame:")
	public native MPCollectionViewAdPlacerCell initWithFrame(
			@ByValue CGRect frame);
}