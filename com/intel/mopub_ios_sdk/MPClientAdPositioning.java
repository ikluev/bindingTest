package com.intel.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.NUInt;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import ios.foundation.NSIndexPath;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPClientAdPositioning extends MPAdPositioning {
	static {
		NatJ.register();
	}

	@Generated
	protected MPClientAdPositioning(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("addFixedIndexPath:")
	public native void addFixedIndexPath(NSIndexPath indexPath);

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPClientAdPositioning alloc();

	@Generated
	@Selector("enableRepeatingPositionsWithInterval:")
	public native void enableRepeatingPositionsWithInterval(@NUInt long interval);

	@Generated
	@Selector("init")
	public native MPClientAdPositioning init();

	@Generated
	@Selector("positioning")
	public static native MPClientAdPositioning positioning();
}