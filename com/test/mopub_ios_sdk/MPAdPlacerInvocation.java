package com.test.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Mapped;
import com.intel.inde.moe.natj.general.ann.MappedReturn;
import com.intel.inde.moe.natj.general.ann.NInt;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.SEL;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import ios.NSObject;
import ios.foundation.NSIndexPath;
import ios.foundation.NSInvocation;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPAdPlacerInvocation extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MPAdPlacerInvocation(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPAdPlacerInvocation alloc();

	@Generated
	@Selector("boolResultForInvocation:defaultValue:")
	public static native boolean boolResultForInvocationDefaultValue(
			NSInvocation invocation, boolean defaultReturnValue);

	@Generated
	@Selector("init")
	public native MPAdPlacerInvocation init();

	@Generated
	@Selector("integerResultForInvocation:defaultValue:")
	@NInt
	public static native long integerResultForInvocationDefaultValue(
			NSInvocation invocation, @NInt long defaultReturnValue);

	@Generated
	@Selector("invokeForTarget:with2ArgSelector:firstArg:secondArg:streamAdPlacer:")
	public static native NSInvocation invokeForTargetWith2ArgSelectorFirstArgSecondArgStreamAdPlacer(
			@Mapped(ObjCObjectMapper.class) Object target, SEL selector,
			@Mapped(ObjCObjectMapper.class) Object arg1, NSIndexPath indexPath,
			MPStreamAdPlacer streamAdPlacer);

	@Generated
	@Selector("invokeForTarget:with3ArgIntSelector:firstArg:secondArg:thirdArg:streamAdPlacer:")
	public static native NSInvocation invokeForTargetWith3ArgIntSelectorFirstArgSecondArgThirdArgStreamAdPlacer(
			@Mapped(ObjCObjectMapper.class) Object target, SEL selector,
			@Mapped(ObjCObjectMapper.class) Object arg1, @NInt long arg2,
			NSIndexPath indexPath, MPStreamAdPlacer streamAdPlacer);

	@Generated
	@Selector("invokeForTarget:with3ArgSelector:firstArg:secondArg:thirdArg:streamAdPlacer:")
	public static native NSInvocation invokeForTargetWith3ArgSelectorFirstArgSecondArgThirdArgStreamAdPlacer(
			@Mapped(ObjCObjectMapper.class) Object target, SEL selector,
			@Mapped(ObjCObjectMapper.class) Object arg1,
			@Mapped(ObjCObjectMapper.class) Object arg2, NSIndexPath indexPath,
			MPStreamAdPlacer streamAdPlacer);

	@Generated
	@Selector("resultForInvocation:defaultValue:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object resultForInvocationDefaultValue(
			NSInvocation invocation,
			@Mapped(ObjCObjectMapper.class) Object defaultReturnValue);
}