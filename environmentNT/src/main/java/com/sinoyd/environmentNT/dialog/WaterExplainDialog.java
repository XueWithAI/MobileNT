package com.sinoyd.environmentNT.dialog;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import com.sinoyd.environmentNT.R;

/**
 * 水质说明弹出框 Copyright (c) 2015 江苏远大信息股份有限公司
 * 
 * @类型名称：WaterExplainDialog


 * @维护人员：
 * @维护日期：
 * @功能摘要：
 */
public class WaterExplainDialog extends AlertDialog {
	public WaterExplainDialog(Context context, boolean cancelable, OnCancelListener cancelListener) {
		super(context, cancelable, cancelListener);
	}

	public WaterExplainDialog(Context context, int theme) {
		super(context, theme);
	}

	public WaterExplainDialog(Context context) {
		super(context);
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dialog_water_explain);
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		dismiss();
		return super.onTouchEvent(event);
	}
}
