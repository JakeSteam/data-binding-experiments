package uk.co.jakelee.databindingexperiments.codelabs.util

import android.view.View
import androidx.databinding.BindingAdapter

@BindingAdapter("app:hideIfZero")
fun hideIfZero(view: View, number: Int) {
    view.visibility = if (number == 0) View.GONE else View.VISIBLE
}