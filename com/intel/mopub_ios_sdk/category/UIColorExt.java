package com.intel.mopub_ios_sdk.category;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.NFloat;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.CategoryClassMethod;
import com.intel.inde.moe.natj.objc.ann.ObjCCategory;
import com.intel.inde.moe.natj.objc.ann.Selector;
import ios.uikit.UIColor;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCCategory(UIColor.class)
public final class UIColorExt {
	static {
		NatJ.register();
	}

	@Generated
	private UIColorExt() {
	}

	@Generated
	@Selector("mp_colorFromHexString:alpha:")
	@CategoryClassMethod
	public static native UIColor mp_colorFromHexStringAlpha(String hexString,
			@NFloat double alpha);
}