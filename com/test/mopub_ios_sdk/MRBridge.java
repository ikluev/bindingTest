package com.test.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.ByValue;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Mapped;
import com.intel.inde.moe.natj.general.ann.MappedReturn;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import com.test.mopub_ios_sdk.protocol.MRBridgeDelegate;
import ios.NSObject;
import ios.coregraphics.struct.CGRect;
import ios.coregraphics.struct.CGSize;
import ios.foundation.NSArray;
import ios.foundation.NSURL;
import ios.uikit.UIWebView;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MRBridge extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MRBridge(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MRBridge alloc();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native MRBridgeDelegate delegate();

	@Generated
	@Selector("fireChangeEventForProperty:")
	public native void fireChangeEventForProperty(MRProperty property);

	@Generated
	@Selector("fireChangeEventsForProperties:")
	public native void fireChangeEventsForProperties(NSArray properties);

	@Generated
	@Selector("fireErrorEventForAction:withMessage:")
	public native void fireErrorEventForActionWithMessage(String action,
			String message);

	@Generated
	@Selector("fireReadyEvent")
	public native void fireReadyEvent();

	@Generated
	@Selector("fireSetCurrentPositionWithPositionRect:")
	public native void fireSetCurrentPositionWithPositionRect(
			@ByValue CGRect positionRect);

	@Generated
	@Selector("fireSetDefaultPositionWithPositionRect:")
	public native void fireSetDefaultPositionWithPositionRect(
			@ByValue CGRect positionRect);

	@Generated
	@Selector("fireSetMaxSize:")
	public native void fireSetMaxSize(@ByValue CGSize maxSize);

	@Generated
	@Selector("fireSetPlacementType:")
	public native void fireSetPlacementType(String placementType);

	@Generated
	@Selector("fireSetScreenSize:")
	public native void fireSetScreenSize(@ByValue CGSize size);

	@Generated
	@Selector("fireSizeChangeEvent:")
	public native void fireSizeChangeEvent(@ByValue CGSize size);

	@Generated
	@Selector("init")
	public native MRBridge init();

	@Generated
	@Selector("initWithWebView:")
	public native MRBridge initWithWebView(UIWebView webView);

	@Generated
	@Selector("loadHTMLString:baseURL:")
	public native void loadHTMLStringBaseURL(String HTML, NSURL baseURL);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) MRBridgeDelegate value);

	@Generated
	public void setDelegate(
			@Mapped(ObjCObjectMapper.class) MRBridgeDelegate value) {
		Object __old = delegate();
		if (value != null) {
			com.intel.inde.moe.natj.objc.ObjCRuntime.associateObjCObject(this,
					value);
		}
		setDelegate_unsafe(value);
		if (__old != null) {
			com.intel.inde.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this,
					__old);
		}
	}

	@Generated
	@Selector("setShouldHandleRequests:")
	public native void setShouldHandleRequests(boolean value);

	@Generated
	@Selector("shouldHandleRequests")
	public native boolean shouldHandleRequests();
}