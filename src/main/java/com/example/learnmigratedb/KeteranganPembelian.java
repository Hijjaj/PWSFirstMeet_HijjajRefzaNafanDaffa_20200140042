/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.learnmigratedb;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author LENOVO
 */
@Entity
@Table(name = "keterangan_pembelian")
@NamedQueries({
    @NamedQuery(name = "KeteranganPembelian.findAll", query = "SELECT k FROM KeteranganPembelian k"),
    @NamedQuery(name = "KeteranganPembelian.findByIdBarang", query = "SELECT k FROM KeteranganPembelian k WHERE k.idBarang = :idBarang"),
    @NamedQuery(name = "KeteranganPembelian.findByNamaBarang", query = "SELECT k FROM KeteranganPembelian k WHERE k.namaBarang = :namaBarang"),
    @NamedQuery(name = "KeteranganPembelian.findByHarga", query = "SELECT k FROM KeteranganPembelian k WHERE k.harga = :harga"),
    @NamedQuery(name = "KeteranganPembelian.findByIdNota", query = "SELECT k FROM KeteranganPembelian k WHERE k.idNota = :idNota"),
    @NamedQuery(name = "KeteranganPembelian.findByIdPegawai", query = "SELECT k FROM KeteranganPembelian k WHERE k.idPegawai = :idPegawai")})
public class KeteranganPembelian implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_barang")
    private String idBarang;
    @Basic(optional = false)
    @Column(name = "nama_barang")
    private String namaBarang;
    @Basic(optional = false)
    @Column(name = "harga")
    private String harga;
    @Basic(optional = false)
    @Column(name = "id_nota")
    private String idNota;
    @Basic(optional = false)
    @Column(name = "id_pegawai")
    private String idPegawai;

    public KeteranganPembelian() {
    }

    public KeteranganPembelian(String idBarang) {
        this.idBarang = idBarang;
    }

    public KeteranganPembelian(String idBarang, String namaBarang, String harga, String idNota, String idPegawai) {
        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
        this.harga = harga;
        this.idNota = idNota;
        this.idPegawai = idPegawai;
    }

    public String getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(String idBarang) {
        this.idBarang = idBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getIdNota() {
        return idNota;
    }

    public void setIdNota(String idNota) {
        this.idNota = idNota;
    }

    public String getIdPegawai() {
        return idPegawai;
    }

    public void setIdPegawai(String idPegawai) {
        this.idPegawai = idPegawai;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBarang != null ? idBarang.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KeteranganPembelian)) {
            return false;
        }
        KeteranganPembelian other = (KeteranganPembelian) object;
        if ((this.idBarang == null && other.idBarang != null) || (this.idBarang != null && !this.idBarang.equals(other.idBarang))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.example.learnmigratedb.KeteranganPembelian[ idBarang=" + idBarang + " ]";
    }
    
}
