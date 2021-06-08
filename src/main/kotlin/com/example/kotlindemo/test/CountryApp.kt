package com.example.kotlindemo.test

class CountryApp {

    fun filterCountries(countries: List<Country>, isMath: (Country) -> Boolean): MutableList<Country> {
        val res = mutableListOf<Country>()
        for (c in countries) {
            if (isMath(c)) {
                res.add(c);
            }
        }
        return res;
    }
}

fun main(args: Array<String>) {
    val isMath = fun(country: Country): Boolean {
        return country.continient == "EU" && country.population > 10000
    }
    val countryApp = CountryApp()
    val country = Country("中国", "EU", 100000)
    val arrayListOf = arrayListOf(country)
    val filterCountries = countryApp.filterCountries(arrayListOf, isMath)
    for (c in filterCountries) {
        print(c.toString())
    }
}