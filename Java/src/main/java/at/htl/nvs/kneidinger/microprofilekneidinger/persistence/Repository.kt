package at.htl.nvs.kneidinger.microprofilekneidinger.persistence

import java.io.Serializable

interface Repository<T>: Serializable {
    fun create(item: T): T
    fun update(item: T)
    fun getAll(): List<T>
    fun getById(id: Long): T
    fun delete(id: Long)
}