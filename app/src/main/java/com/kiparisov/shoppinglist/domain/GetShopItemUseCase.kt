package com.kiparisov.shoppinglist.domain

class GetShopItemUseCase(private val repository: ShopListRepository) {
    fun getShopItem(id: Int): ShopItem{
        return repository.getShopItem(id)
    }
}