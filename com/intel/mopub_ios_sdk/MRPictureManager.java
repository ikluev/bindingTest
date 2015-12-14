package com.intel.mopub_ios_sdk;


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
import com.intel.inde.moe.natj.objc.ann.IsOptional;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import com.intel.mopub_ios_sdk.protocol.MRImageDownloaderDelegate;
import com.intel.mopub_ios_sdk.protocol.MRPictureManagerDelegate;
import ios.NSObject;
import ios.foundation.NSError;
import ios.foundation.NSURL;
import ios.uikit.UIAlertView;
import ios.uikit.protocol.UIAlertViewDelegate;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MRPictureManager extends NSObject implements UIAlertViewDelegate,
		MRImageDownloaderDelegate {
	static {
		NatJ.register();
	}

	@Generated
	protected MRPictureManager(Pointer peer) {
		super(peer);
	}

	@Generated
	@IsOptional
	@Selector("alertView:clickedButtonAtIndex:")
	public native void alertViewClickedButtonAtIndex(UIAlertView alertView,
			@NInt long buttonIndex);

	@Generated
	@IsOptional
	@Selector("alertView:didDismissWithButtonIndex:")
	public native void alertViewDidDismissWithButtonIndex(
			UIAlertView alertView, @NInt long buttonIndex);

	@Generated
	@IsOptional
	@Selector("alertView:willDismissWithButtonIndex:")
	public native void alertViewWillDismissWithButtonIndex(
			UIAlertView alertView, @NInt long buttonIndex);

	@Generated
	@IsOptional
	@Selector("alertViewCancel:")
	public native void alertViewCancel(UIAlertView alertView);

	@Generated
	@IsOptional
	@Selector("alertViewShouldEnableFirstOtherButton:")
	public native boolean alertViewShouldEnableFirstOtherButton(
			UIAlertView alertView);

	@Generated
	@Owned
	@Selector("alloc")
	public static native MRPictureManager alloc();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native MRPictureManagerDelegate delegate();

	@Generated
	@IsOptional
	@Selector("didPresentAlertView:")
	public native void didPresentAlertView(UIAlertView alertView);

	@Generated
	@Selector("downloaderDidFailToSaveImageWithURL:error:")
	public native void downloaderDidFailToSaveImageWithURLError(NSURL URL,
			NSError error);

	@Generated
	@Selector("init")
	public native MRPictureManager init();

	@Generated
	@Selector("initWithDelegate:")
	public native MRPictureManager initWithDelegate(
			@Mapped(ObjCObjectMapper.class) MRPictureManagerDelegate delegate);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) MRPictureManagerDelegate value);

	@Generated
	public void setDelegate(
			@Mapped(ObjCObjectMapper.class) MRPictureManagerDelegate value) {
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
	@Selector("storePicture:")
	public native void storePicture(NSURL url);

	@Generated
	@IsOptional
	@Selector("willPresentAlertView:")
	public native void willPresentAlertView(UIAlertView alertView);
}