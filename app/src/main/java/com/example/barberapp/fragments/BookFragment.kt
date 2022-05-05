package com.example.barberapp.fragments

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.onNavDestinationSelected
import com.example.barberapp.R
import com.example.barberapp.databinding.FragmentBookBinding
import com.example.barberapp.main.BookXApp


class BookFragment : Fragment() {

    lateinit var app: BookXApp
//    var totalDonated = 0
    private var _fragBinding: FragmentBookBinding? = null
    private val fragBinding get() = _fragBinding!!
    //lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        app = activity?.application as BookXApp
        setHasOptionsMenu(true)
        //navController = Navigation.findNavController(activity!!, R.id.nav_host_fragment)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _fragBinding = FragmentBookBinding.inflate(inflater, container, false)
        val root = fragBinding.root
        activity?.title = getString(R.string.bookTitle)


        setButtonListener(fragBinding)
        return root;
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            BookFragment().apply {
                arguments = Bundle().apply {}
            }
    }

    fun setButtonListener(layout: FragmentBookBinding) {
        layout.navBook.setOnClickListener {
            val amount = 15.00
            val appDate = layout.calendarView3.date
            val appTime = layout.spinner.selectedItem
            layout.textView2.text = amount.toString()
            layout.textView3.text = amount.toString()

              //  app.donationsStore.create(DonationModel(paymentmethod = paymentmethod,amount = amount))

        }
    }
    }
//
//    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
//        inflater.inflate(R.menu.menu_book, menu)
//        super.onCreateOptionsMenu(menu, inflater)
//    }
//
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        return NavigationUI.onNavDestinationSelected(item,
//            requireView().findNavController()) || super.onOptionsItemSelected(item)
//    }
//
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        return item.onNavDestinationSelected(navController) || super.onOptionsItemSelected(item)
//    }
//
//    override fun onDestroyView() {
//        super.onDestroyView()
//        _fragBinding = null
//    }
//
//    override fun onResume() {
//        super.onResume()
//        totalDonated = app.donationsStore.findAll().sumOf { it.amount }
//        fragBinding.progressBar.progress = totalDonated
//        fragBinding.totalSoFar.text = "$$totalDonated"
//    }

