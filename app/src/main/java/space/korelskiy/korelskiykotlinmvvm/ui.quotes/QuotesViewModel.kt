package space.korelskiy.korelskiykotlinmvvm.ui.quotes

import androidx.lifecycle.ViewModel
import space.korelskiy.korelskiykotlinmvvm.data.Quote
import space.korelskiy.korelskiykotlinmvvm.data.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository)
    :ViewModel() {

    fun getQuotes() = quoteRepository.getQuotes()

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)
}