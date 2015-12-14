package com.intel.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.ByValue;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Mapped;
import com.intel.inde.moe.natj.general.ann.NFloat;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCBlock;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import com.intel.mopub_ios_sdk.protocol.MPNativeAdRendererSettings;
import ios.NSObject;
import ios.coregraphics.struct.CGSize;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MOPUBNativeVideoAdRenderer extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MOPUBNativeVideoAdRenderer(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MOPUBNativeVideoAdRenderer alloc();

	@Generated
	@Selector("init")
	public native MOPUBNativeVideoAdRenderer init();

	@Generated
	@Selector("rendererConfigurationWithRendererSettings:")
	public static native MPNativeAdRendererConfiguration rendererConfigurationWithRendererSettings(
			@Mapped(ObjCObjectMapper.class) MPNativeAdRendererSettings rendererSettings);

	@Generated
	@Selector("viewSizeHandler")
	@ObjCBlock(name = "call_viewSizeHandler_ret")
	public native Block_viewSizeHandler_ret viewSizeHandler();

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_viewSizeHandler_ret {
		@Generated
		@ByValue
		CGSize call_viewSizeHandler_ret(@NFloat double arg0);
	}
}