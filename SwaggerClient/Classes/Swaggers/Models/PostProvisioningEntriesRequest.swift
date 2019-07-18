//
// PostProvisioningEntriesRequest.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct PostProvisioningEntriesRequest: Codable {

    public var date: String?
    public var locale: String?
    public var dateFormat: String?
    public var createjournalentries: String?
    public var provisioningentry: String?
    public var entries: String?

    public init(date: String?, locale: String?, dateFormat: String?, createjournalentries: String?, provisioningentry: String?, entries: String?) {
        self.date = date
        self.locale = locale
        self.dateFormat = dateFormat
        self.createjournalentries = createjournalentries
        self.provisioningentry = provisioningentry
        self.entries = entries
    }


}
