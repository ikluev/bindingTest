package com.test.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.NInt;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.IsOptional;
import com.intel.inde.moe.natj.objc.ann.ObjCBlock;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import ios.NSObject;
import ios.foundation.NSURL;
import ios.uikit.UIAlertView;
import ios.uikit.protocol.UIAlertViewDelegate;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPTelephoneConfirmationController extends NSObject implements
		UIAlertViewDelegate {
	static {
		NatJ.register();
	}

	@Generated
	protected MPTelephoneConfirmationController(Pointer peer) {
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
	public static native MPTelephoneConfirmationController alloc();

	@Generated
	@IsOptional
	@Selector("didPresentAlertView:")
	public native void didPresentAlertView(UIAlertView alertView);

	@Generated
	@Selector("init")
	public native MPTelephoneConfirmationController init();

	@Generated
	@Selector("initWithURL:clickHandler:")
	public native MPTelephoneConfirmationController initWithURLClickHandler(
			NSURL url,
			@ObjCBlock(name = "call_initWithURLClickHandler") Block_initWithURLClickHandler clickHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_initWithURLClickHandler {
		@Generated
		void call_initWithURLClickHandler(NSURL arg0, boolean arg1);
	}

	@Generated
	@Selector("show")
	public native void show();

	@Generated
	@IsOptional
	@Selector("willPresentAlertView:")
	public native void willPresentAlertView(UIAlertView alertView);
}