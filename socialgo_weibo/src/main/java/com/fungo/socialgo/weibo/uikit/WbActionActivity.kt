package com.fungo.socialgo.weibo.uikit

import com.fungo.socialgo.uikit.BaseSocialActivity
import com.sina.weibo.sdk.constant.WBConstants
import com.sina.weibo.sdk.share.WbShareCallback

/**
 * @author Pinger
 * @since 2019/1/31 15:15
 */
class WbActionActivity : BaseSocialActivity(), WbShareCallback {

    override fun onWbShareFail() {
        handleResp(WBConstants.ErrorCode.ERR_FAIL)
    }

    override fun onWbShareCancel() {
        handleResp(WBConstants.ErrorCode.ERR_CANCEL)
    }

    override fun onWbShareSuccess() {
        handleResp(WBConstants.ErrorCode.ERR_OK)
    }
}