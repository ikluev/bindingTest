package com.intel.mopub_ios_sdk.category;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.NFloat;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCCategory;
import com.intel.inde.moe.natj.objc.ann.Selector;
import ios.uikit.UIImage;
import ios.uikit.UIView;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCCategory(UIView.class)
public final class UIViewExt {
	static {
		NatJ.register();
	}

	@Generated
	private UIViewExt() {
	}

	@Generated
	@Selector("mp_height")
	@NFloat
	public static native double mp_height(UIView _object);

	@Generated
	@Selector("mp_snapshot:")
	public static native UIImage mp_snapshot(UIView _object,
			boolean usePresentationLayer);

	@Generated
	@Selector("mp_snapshotView")
	public static native UIView mp_snapshotView(UIView _object);

	@Generated
	@Selector("mp_width")
	@NFloat
	public static native double mp_width(UIView _object);

	@Generated
	@Selector("mp_x")
	@NFloat
	public static native double mp_x(UIView _object);

	@Generated
	@Selector("mp_y")
	@NFloat
	public static native double mp_y(UIView _object);

	@Generated
	@Selector("setMp_height:")
	public static native void setMp_height(UIView _object,
			@NFloat double mp_height);

	@Generated
	@Selector("setMp_width:")
	public static native void setMp_width(UIView _object,
			@NFloat double mp_width);

	@Generated
	@Selector("setMp_x:")
	public static native void setMp_x(UIView _object, @NFloat double mp_x);

	@Generated
	@Selector("setMp_y:")
	public static native void setMp_y(UIView _object, @NFloat double mp_y);
}