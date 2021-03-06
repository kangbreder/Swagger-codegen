//
// GetClientClientIdAddressesResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetClientClientIdAddressesResponse: Codable {

    public var clientId: Int64?
    public var addressType: String?
    public var addressId: Int?
    public var addressTypeId: Int?
    public var isActive: Bool?
    public var street: String?
    public var addressLine1: String?
    public var addressLine2: String?
    public var addressLine3: String?
    public var townVillage: String?
    public var city: String?
    public var countyDistrict: String?
    public var stateProvinceId: Int?
    public var countryName: String?
    public var stateName: String?
    public var countryId: Int?
    public var postalCode: Int64?
    public var createdBy: String?
    public var updatedBy: String?

    public init(clientId: Int64?, addressType: String?, addressId: Int?, addressTypeId: Int?, isActive: Bool?, street: String?, addressLine1: String?, addressLine2: String?, addressLine3: String?, townVillage: String?, city: String?, countyDistrict: String?, stateProvinceId: Int?, countryName: String?, stateName: String?, countryId: Int?, postalCode: Int64?, createdBy: String?, updatedBy: String?) {
        self.clientId = clientId
        self.addressType = addressType
        self.addressId = addressId
        self.addressTypeId = addressTypeId
        self.isActive = isActive
        self.street = street
        self.addressLine1 = addressLine1
        self.addressLine2 = addressLine2
        self.addressLine3 = addressLine3
        self.townVillage = townVillage
        self.city = city
        self.countyDistrict = countyDistrict
        self.stateProvinceId = stateProvinceId
        self.countryName = countryName
        self.stateName = stateName
        self.countryId = countryId
        self.postalCode = postalCode
        self.createdBy = createdBy
        self.updatedBy = updatedBy
    }

    public enum CodingKeys: String, CodingKey { 
        case clientId = "client_id"
        case addressType
        case addressId
        case addressTypeId
        case isActive
        case street
        case addressLine1
        case addressLine2
        case addressLine3
        case townVillage
        case city
        case countyDistrict
        case stateProvinceId
        case countryName
        case stateName
        case countryId
        case postalCode
        case createdBy
        case updatedBy
    }


}

