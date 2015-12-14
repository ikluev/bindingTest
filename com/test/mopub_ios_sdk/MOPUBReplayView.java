package com.test.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.ByValue;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.NUInt;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCBlock;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import ios.coregraphics.struct.CGRect;
import ios.foundation.NSCoder;
import ios.uikit.UIView;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MOPUBReplayView extends UIView {
	static {
		NatJ.register();
	}

	@Generated
	protected MOPUBReplayView(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("actionBlock")
	@ObjCBlock(name = "call_actionBlock_ret")
	public native Block_actionBlock_ret actionBlock();

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_actionBlock_ret {
		@Generated
		void call_actionBlock_ret(MOPUBReplayView arg0);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MOPUBReplayView alloc();

	@Generated
	@Selector("init")
	public native MOPUBReplayView init();

	@Generated
	@Selector("initWithCoder:")
	public native MOPUBReplayView initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithFrame:")
	public native MOPUBReplayView initWithFrame(@ByValue CGRect frame);

	@Generated
	@Selector("initWithFrame:displayMode:")
	public native MOPUBReplayView initWithFrameDisplayMode(
			@ByValue CGRect frame, @NUInt long displayMode);

	@Generated
	@Selector("setActionBlock:")
	public native void setActionBlock(
			@ObjCBlock(name = "call_setActionBlock") Block_setActionBlock value);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_setActionBlock {
		@Generated
		void call_setActionBlock(MOPUBReplayView arg0);
	}
}