/*
    Author：Xiexuan
    Data:2013.10.10
    Email: xiexuan200308@126.com
*/
/*********************************************************
	AES加密算法即：高级加密标准（Advanced Encryption Standard，缩写：AES）
	在密码学中又称Rijndael加密算法。
	这里用C实现了AES，明文块为128bit，秘钥为128bit。
*********************************************************/

#define true 1
#define false 0

/*********************************************************/
int Encrypt(char *Msg,  char *Key, char *Cipher,int length); //length表示要加密的Msg的长度,密钥长度为16个字节
int Decrypt(char *Cipher,  char *Key, char *Msg,int length);  //length表示要解密的Cipher的长度，密钥长度为16个字节
unsigned char* encrypt(unsigned char* input,unsigned char* result);
unsigned char* decrypt(unsigned char* input,unsigned char* result);
void initKey(unsigned char* key);

void KeyExpansion(unsigned char* key, unsigned char w[][4][4]);
unsigned char FFmul(unsigned char a, unsigned char b);
void SubBytes(unsigned char state[][4]);
void ShiftRows(unsigned char state[][4]);
void MixColumns(unsigned char state[][4]);
void AddRoundKey(unsigned char state[][4], unsigned char k[][4]);
void InvSubBytes(unsigned char state[][4]);
void InvShiftRows(unsigned char state[][4]);
void InvMixColumns(unsigned char state[][4]);
/*********************************************************/

