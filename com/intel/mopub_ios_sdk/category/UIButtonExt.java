package com.intel.mopub_ios_sdk.category;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.ann.ByValue;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCCategory;
import com.intel.inde.moe.natj.objc.ann.Selector;
import ios.uikit.UIButton;
import ios.uikit.struct.UIEdgeInsets;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCCategory(UIButton.class)
public final class UIButtonExt {
	static {
		NatJ.register();
	}

	@Generated
	private UIButtonExt() {
	}

	@Generated
	@Selector("mp_TouchAreaInsets")
	@ByValue
	public static native UIEdgeInsets mp_TouchAreaInsets(UIButton _object);

	@Generated
	@Selector("setMp_TouchAreaInsets:")
	public static native void setMp_TouchAreaInsets(UIButton _object,
			@ByValue UIEdgeInsets value);
}