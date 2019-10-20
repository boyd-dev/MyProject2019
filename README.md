### Master

A world class development environment, testing framework and asset pipeline for blockchains
using the Ethereum Virtual Machine (EVM), aiming to make life as a developer easier.

web3.js is a collection of libraries which allow you to interact with a local or remote
ethereum node, using a HTTP or IPC connection.

PromiEvents work like a normal promises with added on, once and off functions.
This way developers can watch for additional events like on “receipt” or “transactionHash”.

The web3.eth.subscribe function lets you subscribe to specific events in the blockchain.

subscribe(“logs”)
Subscribes to incoming logs, filtered by the given options.

The web3.eth.Contract object makes it easy to interact with smart contracts on the ethereum blockchain.
When you create a new contract object you give it the json interface of the respective smart contract
and web3 will auto convert all calls into low level ABI calls over RPC for you.
