package com.intel.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import ios.foundation.NSError;
import ios.foundation.NSOperation;
import ios.foundation.NSSet;
import ios.foundation.NSThread;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPQRunLoopOperation extends NSOperation {
	static {
		NatJ.register();
	}

	@Generated
	protected MPQRunLoopOperation(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("actualRunLoopModes")
	public native NSSet actualRunLoopModes();

	@Generated
	@Selector("actualRunLoopThread")
	public native NSThread actualRunLoopThread();

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPQRunLoopOperation alloc();

	@Generated
	@Selector("error")
	public native NSError error();

	@Generated
	@Selector("finishWithError:")
	public native void finishWithError(NSError error);

	@Generated
	@Selector("init")
	public native MPQRunLoopOperation init();

	@Generated
	@Selector("isActualRunLoopThread")
	public native boolean isActualRunLoopThread();

	@Generated
	@Selector("operationDidStart")
	public native void operationDidStart();

	@Generated
	@Selector("operationWillFinish")
	public native void operationWillFinish();

	@Generated
	@Selector("runLoopModes")
	public native NSSet runLoopModes();

	@Generated
	@Selector("runLoopThread")
	public native NSThread runLoopThread();

	@Generated
	@Selector("setRunLoopModes:")
	public native void setRunLoopModes(NSSet value);

	@Generated
	@Selector("setRunLoopThread:")
	public native void setRunLoopThread(NSThread value);

	@Generated
	@Selector("state")
	public native int state();
}