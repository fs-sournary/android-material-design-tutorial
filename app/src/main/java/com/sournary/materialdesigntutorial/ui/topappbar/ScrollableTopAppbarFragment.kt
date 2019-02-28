package com.sournary.materialdesigntutorial.ui.topappbar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sournary.materialdesigntutorial.R

/**
 * Created on 2019-09-22 by Sang
 * Description:
 **/
class ScrollableTopAppbarFragment : BaseTopAppbarFragment(){

    override fun getCurrentDestId(): Int = R.id.scrollable_top_appbar_dest

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_scrollable_top_appbar, container, false)
}
