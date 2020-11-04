package space.korelskiy.korelskiykotlinmvvm.utilities

import space.korelskiy.korelskiykotlinmvvm.data.FakeDatabase
import space.korelskiy.korelskiykotlinmvvm.data.QuoteRepository
import space.korelskiy.korelskiykotlinmvvm.ui.quotes.QuotesViewModelFactory

object InjectorUtils {

    fun provideQuotesViewModelFactory(): QuotesViewModelFactory{
        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepository)
    }
}