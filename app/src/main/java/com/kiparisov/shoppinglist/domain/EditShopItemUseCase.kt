package com.kiparisov.shoppinglist.domain

class EditShopItemUseCase(private val repository: ShopListRepository) {
    fun editShopItem(shopItem: ShopItem): ShopItem{
        return repository.editShopItem(shopItem)
    }
}