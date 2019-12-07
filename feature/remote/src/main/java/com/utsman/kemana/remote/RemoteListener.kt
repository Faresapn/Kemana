package com.utsman.kemana.remote

interface RemoteListener {
    fun insertDriver(driverItem: Driver, driver: (success: Boolean, driver: Driver?) -> Unit)
    fun getDriversActive(list: (List<Driver>?) -> Unit)
    fun getDriver(id: String, driver: (Driver?) -> Unit)
    fun getDriver(id: String) : Driver?
    fun editDriver(id: String, position: Position, driver: (Driver?) -> Unit)
    fun editDriverByEmail(email: String, position: Position, driver: (Driver?) -> Unit)
    fun deleteDriver(id: String, status: (Boolean?) -> Unit)
    fun deleteDriverByEmail(email: String, status: (Boolean?) -> Unit)
    fun detachPresenter()
}