package com.cvaccari.circleimageview.utils

import androidx.annotation.IntDef
import com.cvaccari.circleimageview.AvatarImageView
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy


@IntDef(
    AvatarImageView.SHOW_INITIAL,
    AvatarImageView.SHOW_IMAGE
)
@Retention(RetentionPolicy.SOURCE)
annotation class StateIntDef